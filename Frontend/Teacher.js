class Teacher
{
    tid:number;
    std_year:number;
    std_branch:string;
    cal_year:number;
    std_section:string;

    constructor(tid:number,std_year:number,std_branch:string,cal_year:number,std_section:string)
    {
        this.tid=tid;
        this.std_year=std_year;
        this.std_branch=std_branch;
        this.cal_year=cal_year;
        this.std_section=std_section;
    }

}
export default Teacher;