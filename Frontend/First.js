import React from "react";
import StudentService from "./StudentService";
import subjectService from "./subjectService";
import serviceFeedback from "./serviceFeedback";
import FeedBack from "./FeedBack";
import "./First.css";
class First extends React.Component
{
    constructor(props)
    {
        super(props)
        this.state=({elist:[],rlist:[],regno:'',submissionStatus: {}})
        this.selectRefs = []; 
    }
    insertFeedBack=(v1,v2,index)=>
    {
        const std_regno=this.state.regno;
        let q1= this.selectRefs[index][0].value;
        let q2= this.selectRefs[index][1].value;
        let q3= this.selectRefs[index][2].value;
        let q4= this.selectRefs[index][3].value;
        let q5=this.selectRefs[index][4].value;
        let comment=this.selectRefs[index][5].value;
        let tid=v1;
        let sname=v2;
        let fb=new FeedBack(tid,std_regno,q1,q2,q3,q4,q5,comment,this.state.elist[0][1],this.state.elist[0][4],this.state.elist[0][3],sname,this.state.elist[0][0])
        serviceFeedback.insertFeedBack(fb)
        this.setState(prevState => ({
            submissionStatus: {
              ...prevState.submissionStatus,
              [index]: true
            }
          }));
    }
    componentDidMount() {
            const inputElement = document.getElementById('load');
            if (inputElement) {
              inputElement.focus();
          }
        this.setState(prevState => ({
            elist: prevState.elist.map(() => []),
            rlist: prevState.rlist.map(() => []),
            regno:'',
            submissionStatus: {},
          }));
      }
    getDetails = () => {
        let id = this.refs.r1.value;
        this.setState({regno:id})
        StudentService.getStudentDetails(id)
            .then(response => {
                const elist=response.data;
                this.setState({elist:response.data});
                subjectService.getTeacherDetails(elist[0][0], elist[0][1], elist[0][3], elist[0][4])
                    .then(response => this.setState({ rlist: response.data }))
                    .catch(error => {
                        console.error("Error in subjectService.getTeacherDetails:", error);
                    });
            })
            .catch(error => {
                console.error("Error in StudentService.getStudentDetails:", error);
            });
    }
    addSelectRef = (ref, index) => {
        if (!this.selectRefs[index]) {
          this.selectRefs[index] = [];
        }
        this.selectRefs[index].push(ref);
    };
    render()
    {
        return(
            <>
            <form>
                <input type="text" placeholder="enter Reg_no" ref="r1" id="load" autoFocus/><br />
                <input type="button" value="Submit" onClick={this.getDetails} class="btn btn-success"/>
            </form>
            <table class="table table-striped table-bordered">
            <caption>Fill The FeedBack Form</caption>
            <tr>
                <th>Teacher Id</th>
                <th>Teacher Subject</th>
                <th>Question 1</th>     
                <th>Question 2</th>
                <th>Question 3</th>
                <th>Question 4</th>
                <th>Question 5</th>
                <th>Comments</th>
                <th>Action</th>
            </tr>
            <tbody>
                {   
                    this.state.rlist.map((e,index)=><tr key={index}>
                    <td>{e[0]}</td>
                    <td>{e[1]}</td>
                    <td>
                    <select ref={(ref) => this.addSelectRef(ref, index)}>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                    </td>
                    <td>
                    <select ref={(ref) => this.addSelectRef(ref, index)}>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                    </td>
                    <td>
                    <select ref={(ref) => this.addSelectRef(ref, index)}>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                    </td>
                    <td>
                    <select ref={(ref) => this.addSelectRef(ref, index)}>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                    </td>
                    <td>
                    <select ref={(ref) => this.addSelectRef(ref, index)}>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                    </td>
                    <td>
                    <label for="comments">Comments</label>
                    <textarea id="comments" name="comments" rows="2" cols="50" defaultValue="No comments" ref={(ref) => this.addSelectRef(ref, index)}>
                    </textarea>
                    </td>
                    <td><input type="button" value={this.state.submissionStatus[index] ? "Submitted" : "Submit"} disabled={this.state.submissionStatus[index]} onClick={()=>this.insertFeedBack(e[0],e[1],index)} class="btn btn-success"/></td>
                    </tr>
                    )
                }
            </tbody>
            </table>
        </>
        )
    }
}
export default First;