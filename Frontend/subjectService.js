import axios from "axios";
class subjectService
{
    static getTeacherDetails(v1,v2,v3,v4)
    {
        return axios.get(`http://localhost:8091/teacher/${v1}/${v2}/${v3}/${v4}`);
    }
}
export default subjectService;