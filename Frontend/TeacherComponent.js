import React from "react";
import TeacherService from "./TeacherService";
import "./TeacherComponent.css";
import Nav from "./Nav";
class TeacherComponent extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={elist:[],rlist:[]}
    }
    componentDidMount() {
        const inputElement = document.getElementById('load');
        if (inputElement) {
          inputElement.focus();
        }
      }
    getComments=()=>
    {
       let v1=this.refs.t1.value;
       let v2=this.refs.t2.value;
       let v3=this.refs.t3.value;
       let v4=this.refs.t4.value;
       let v5=this.refs.t5.value;
        TeacherService.getComments(v1,v2,v3,v4,v5).then(response=>this.setState({elist:response.data}));
        TeacherService.getRatings(v1,v2,v3,v4,v5).then(response=>this.setState({rlist:response.data}));
    }
    render()
    {
        return(
            <>
            { /*<table align="center" border="1" width="50%">
                <tr>
                    <th>Teacher Id</th>
                    <td><input type="text" ref="t1" /></td>
                </tr>
                <tr>
                    <th>std_year</th>
                    <td><input type="text" ref="t2" /></td>
                </tr>
                <tr>
                    <th>std_branch</th>
                    <td><input type="text" ref="t3" /></td>
                </tr>
                <tr>
                    <th>cal_year</th>
                    <td><input type="text" ref="t4" /></td>
                </tr>
                <tr>
                    <th>std_sem</th>
                    <td><input type="text" ref="t5" /></td>
                </tr>
                <tr>
                    <th>std_section</th>
                    <td><input type="text" ref="t6" /></td>
                </tr>
                <tr>
                    <th>sname</th>
                    <td><input type="text" ref="t7" /></td>
                </tr>
                <tr>
                    <td><input type="button" value="Get Comments" onClick={this.getComments} class="btn btn-success"/></td>
                </tr>
        </table> */}
            <Nav />
            <div className="form-teacher">
            <form>
                <input type="text" placeholder="Teacher Id" ref="t1" id="load" autoFocus required/><br/>
                <input type="text" placeholder="Study Year" ref="t2" required/><br/>
                <input type="text" placeholder="study branch" ref="t3" required/><br/>
                <input type="text" placeholder="current year" ref="t4" required/><br/>
                <input type="text" placeholder="Section" ref="t5" required/><br/>
                <input type="button" value="Get Comments" onClick={this.getComments} />
            </form>
            </div>
            <div className="table-teacher">
            <table align="center" width="50%" border="1">
                <caption>Average Ratings For Each Questions</caption>
                <tr>
                    <th>Question 1</th>
                    <th>Question 2</th>
                    <th>Question 3</th>
                    <th>Question 4</th>
                    <th>Question 5</th>
                </tr>
                <tbody> 
                    {   this.state.rlist.map((r,index)=>
                        <tr key={index}>
                        <td>{r[0]}</td>
                        <td>{r[1]}</td>
                        <td>{r[2]}</td>
                        <td>{r[3]}</td>
                        <td>{r[4]}</td>
                        </tr>
                        )
                    }
            </tbody>
            </table>
            <table align="center" border="1" width="30%">
                <caption>Comments</caption>
                <tbody>
                    {   this.state.elist.map((e,index)=><tr key={index}>
                        <td>{e}</td>
                        </tr>
                        )
                    }
                </tbody>
            </table>
            </div>
            </>
        )
    }
}
export default TeacherComponent;