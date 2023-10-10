import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css'; // Import Bootstrap CSS
import './Login.css'; // Import custom styles

const Login = () => {
  return (
    <div className="login-container">
      <h2>Login</h2>
      <form>
        <div className="form-group">
          <label htmlFor="teacherId">Teacher ID</label>
          <input type="text" className="form-control" id="teacherId" />
        </div>
        <div className="form-group">
          <label htmlFor="teacherPassword">Password</label>
          <input type="password" className="form-control" id="teacherPassword" />
        </div>
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>
    </div>
  );
};

export default Login;
