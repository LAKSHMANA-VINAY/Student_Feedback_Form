import React from "react";
import TeacherService from "./TeacherService";
import "./Academic.css";
import Nav from "./Nav";
class Academic extends React.Component
{
    constructor(props)
    {
        super(props)
        this.state={elist:[]}
    }
    componentDidMount() {
        const inputElement = document.getElementById('load');
        if (inputElement) {
          inputElement.focus();
        }
      }

    getAcademicDetails=()=>
    {
            let v1=this.refs.t1.value;
            let v2=this.refs.t2.value;
            TeacherService.getAcademicDetails(v1,v2).then(response=>this.setState({elist:response.data}));
    }
    render()
    {
        return(
            <>
                <Nav />
                <div className="form">
                <form>
                    <input type="text" placeholder="Teacher Id" ref="t1" id="load" autoFocus required/><br></br>
                    <input type="text" placeholder="Enter Academic Year" ref="t2" required/><br></br>
                    <input type="button" class="btn btn-success" onClick={this.getAcademicDetails} value="Submit"/>
                </form>
                </div>
                <table align="center" width="50%" border="1">
                    <caption>Academic Details</caption>
                    <tr>
                    <th>BRANCH</th>
                    <th>SECTION</th>
                    <th>SUBJECT</th>
                    <th>YEAR</th>
                    <th>SEM</th>
                </tr>
                    <tbody>
                        {
                            this.state.elist.map(e=><tr>
                                <td>{e[0]}</td>
                                <td>{e[1]}</td>
                                <td>{e[2]}</td>
                                <td>{e[3]}</td>
                                <td>{e[4]}</td>
                            </tr>)
                        }
                    </tbody>
                </table>
            </>
        )
    }
}
export default Academic;