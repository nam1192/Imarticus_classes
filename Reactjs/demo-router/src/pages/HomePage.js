import React, { useState } from 'react';
import { Link } from "react-router-dom";


// export default function HomePage(){
//     return(
//         <div>
//             <h1>Home Page</h1>
//             <p>
//                 <Link to="/itasworkshop">itasworkshop</Link> on GitHub.
//             </p>
//         </div>
//     );
// }

export default function HomePage1(props) {

  const [email, setemail] = useState("");
  const [pwd, setpwd] = useState("");

  const changeHandler = (event) => {
    var val = event.target.value;
    if (event.target.name == "email") {
      setemail(val);
    }
    else if (event.target.name == "pwd") {
      setpwd(val);
    }
  }
  const handleSubmit = () => {
    if (email === "abc@gmail.com" && pwd === "pass") {
      alert("login successfull")
    } else {
      alert("invalid credentials")
    }
  }
  return (<div className="App auth-wrapper auth-inner">


    <form class="row g-3" onSubmit={handleSubmit} >
      <h3>Login In</h3>
      <div className='box1'>
        <div class="col-md-6">
          <label for="inputEmail4" class="form-label">Email</label>
          <input name="email" type="email" class="form-control" id="inputEmail4" onChange={changeHandler} className="form-control" placeholder="Enter email" />
        </div>
        <br/>
        <div class="col-md-6">
          <label for="inputPassword4" class="form-label">Password</label>
          <input name="pwd" type="password" class="form-control" id="inputPassword4" onChange={changeHandler} className="form-control" placeholder="Enter password" />
        </div>

        {/* <div className="form-group">
        <label>Email address</label>
        <input name="email" type="email" onChange={changeHandler} className="form-control" placeholder="Enter email" />
      </div>

      <div className="form-group">
        <label>Password</label>
        <input name="pwd" type="password" onChange={changeHandler} className="form-control" placeholder="Enter password" />
      </div> */}

<br/>
        <Link to="/itasworkshop"><button type="submit" className="btn btn-primary btn-block pad ">Login</button>
        </Link>
        {/* <p className="forgot-password text-right">
                      New to site <a href="hook_signup.js">sign up?</a>
                  </p> */}
      </div>
    </form></div>
  );

}