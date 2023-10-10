import axios from "axios";
class StudentService
{
    static getStudentDetails(id)
    {
        return axios.get(`http://localhost:8091/studentDetails/${id}`);
    }
}
export default StudentService;