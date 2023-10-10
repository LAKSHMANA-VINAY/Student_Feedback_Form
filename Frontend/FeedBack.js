class FeedBack
{
    tid:number;
    std_regno:string;
    q1:number;
    q2:number;
    q3:number;
    q4:number;
    q5:number;
    comments:string;
    cal_year:number;
    section:string;
    year:number;
    sname:string;
    branch:string;

    constructor(tid:number,std_regno:string,q1:number,q2:number,q3:number,q4:number,q5:number,comments:string,cal_year:number,section:string,year:number,sname:string,branch:string)
    {
        this.tid=tid;
        this.std_regno=std_regno;
        this.q1=q1;
        this.q2=q2;
        this.q3=q3;
        this.q4=q4;
        this.q5=q5;
        this.comments=comments;
        this.cal_year=cal_year;
        this.section=section;
        this.year=year;
        this.sname=sname;
        this.branch=branch;

    }

}
export default FeedBack;


