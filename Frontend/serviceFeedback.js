import axios from "axios";
class serviceFeedback
{
    static insertFeedBack(fb)
    {
        return axios.post('http://localhost:8091/student/feedback',fb);
    }
}
export default serviceFeedback
;