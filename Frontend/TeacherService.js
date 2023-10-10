import axios from "axios";
class TeacherService
{
    static getComments(v1,v2,v3,v4,v5)
    {
        return axios.get(`http://localhost:8091/comment/${v1}/${v2}/${v3}/${v4}/${v5}`);
    }
    static getRatings(v1,v2,v3,v4,v5)
    {
        return axios.get(`http://localhost:8091/${v1}/${v2}/${v3}/${v4}/${v5}`);
    }
    static getAcademicDetails(v1,v2)
    {
        return axios.get(`http://localhost:8091/academic/${v1}/${v2}`);
    }
}
export default TeacherService;