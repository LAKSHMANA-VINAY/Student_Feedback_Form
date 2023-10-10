import "./Nav.css";
import {Link} from "react-router-dom";
export default function Nav()
{
    return(
        <div className="main">
            <nav>
            <input type="checkbox" id="check" />
            <label for="check" className="checkbtn">
                <i className="fa-solid fa-bars"></i>
            </label>
            <label className="logo">SRKR ENGINEERING COLLEGE</label>
            <ul>
                <li><Link to="/feedback" >FeedBack</Link></li>
                <li><Link to="/academics" >Academics</Link></li>
                <li><Link to="/about" >About</Link></li>
                <li><Link to="/">Logout</Link></li>
            </ul>
        </nav>
        </div>
    )
}