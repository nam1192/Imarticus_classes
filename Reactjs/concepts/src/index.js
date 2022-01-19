import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';


// class StudentForm extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = { stname: '', lname: '', stemail: '', pwd: '', stcity: '', isPass: true, noOfAttempts: 5 };
//     this.handleChange = this.handleChange.bind(this);
//     this.handleSubmit = this.handleSubmit.bind(this);
//   }

//   handleChange(event) {
//     //this.setState({value: event.target.value});
//     const target = event.target;
//     const value = target.name === "isPass" ? target.checked : target.value;
//     const name = target.name;

//     console.log(name + " " + value);
//     this.setState({ [name]: value });
//   }

//   handleSubmit(event) {
//     alert('Are you sure you want to submit? ' + this.state.stname + " "+ this.state.lname);
//     event.preventDefault();
//   }


//   render() {
//     return (
//       <div>
//         <h1>Sign Up</h1> <br />
//         <form class="row g-3" onSubmit={this.handleSubmit}>
//           <div class="row">
//             <div class="col">
//             <label for="inputEmail4" class="form-label">First Name</label>
//               <input name="stname" type="text" class="form-control" placeholder="First name" aria-label="First name"value={this.state.stname} onChange={this.handleChange} />
//             </div>
//             <div class="col">
//             <label for="inputEmail4" class="form-label">Last Name</label>
//               <input name="lname" type="text" class="form-control" placeholder="Last name" aria-label="Last name" value={this.state.lname} onChange={this.handleChange} />
//             </div>
//             </div>
//           <div class="col-md-6">
//             <label for="inputEmail4" class="form-label">Email</label>
//             <input name="stemail" type="email" class="form-control" id="inputEmail4" value={this.state.stemail} onChange={this.handleChange}/>
//           </div>
//           <div class="col-md-6">
//             <label for="inputPassword4" class="form-label">Password</label>
//             <input name="pwd" type="password" class="form-control" id="inputPassword4" value={this.state.pwd} onChange={this.handleChange} />
//           </div>
//           <div class="col-md-6">
//             <label for="inputCity" class="form-label">City</label>
//             <input name="stcity" type="text" class="form-control" id="inputCity" value={this.state.stcity} onChange={this.handleChange} />
//           </div>

//           <div class="col-md-2">
//             <label for="inputNum" class="form-label">Phone No</label>
//             <input name="noOfAttempts" type="number" class="form-control" id="inputZip" value={this.state.noOfAttempts} onChange={this.handleChange} />
//           </div>
//           <div class="col-12">
//             <div class="form-check">
//               <input name="isPass" class="form-check-input" type="checkbox" id="gridCheck" checked={this.state.isPass} onChange={this.handleChange} />
//               <label class="form-check-label" for="gridCheck">
//                 Check me out
//               </label>
//             </div>
//           </div>
//           <div class="col-12">
//             <button type="submit" class="btn btn-primary">Sign in</button>
//           </div>
//         </form>
//       </div>
//     );
//   }
// }

// ReactDOM.render(
//   <StudentForm />,
//   document.getElementById('root')
// );




// -----------------------------------------------------
// Calculator using Hooks: 

// function MyCalculatorWithHook(props){

//   const[first,setFirst] = useState(props.a);
//   const[second,setSecond] = useState(props.b);
//   const[Add,setAdd] = useState("");
//   const[Sub,setSub] = useState("");
//   const[Mul,setMul] = useState("");
//   const[Div,setDiv] = useState("");

//   const handleAddition = () =>{
//     setAdd(parseInt(first)+parseInt(second));

//   }
//   const handleSubtract = () =>{
//     setSub(parseInt(first)-parseInt(second));

//   }
//   const handleMultiply = () =>{
//     setMul(parseInt(first)*parseInt(second));

//   }
//   const handleDivide = () =>{
//     setDiv(parseInt(first)/parseInt(second));

//   }

//   return(
//     <div>
//       <h2>Enter 2 values: </h2>
//       <input type="text" value={first} onChange={e => setFirst(+e.target.value)} placeholder="Enter First number" /> <br/> <br/>
//       <input type="text"  value={second}  onChange={e => setSecond(+e.target.value)}  placeholder="Enter second number" /> <br/> <br/>
//       <button onClick={handleAddition}>Add</button>
//       {/* <p>Addition of {first} and {second} is {Add}</p> */}
//       <button onClick={handleSubtract}>Sub</button>
//       {/* <p>Subtraction of {first} and {second} is {Sub}</p> */}
//       <button onClick={handleMultiply}>Mul</button>
//       {/* <p>Multiplication of {first} and {second} is {Mul}</p> */}
//       <button onClick={handleDivide}>Div</button>
//       {/* <p>Division of {first} and {second} is {Div}</p> */}
//       <p>The result of {first} and {second} is {Add} {Sub} {Mul} {Div}</p>
//     </div>
//   );

// }

// ReactDOM.render(  
//   <MyCalculatorWithHook  /> ,
// document.getElementById('root')
// );


// -------------------------------------------------------
// Login page with Hooks :

function MySingUpWithHook(props) {

  const [inputField, setInputField] = useState({
    email: '',
    pass: ''
  })

  const inputsHandler = (e) => {
    setInputField({ [e.target.name]: e.target.value })
  }

  const submitButton = () => {
    // alert(inputField.email)
    alert("Login successful")
  }

  return (
    <div class="myBox">
      <div class="col-md-6">
        <label for="inputEmail4" class="form-label">Email</label>
        <input name="email" type="email" class="form-control" id="inputEmail4" onChange={inputsHandler} value={inputField.first_name} placeholder='Enter your Email Id' />
      </div>
      <div class="col-md-6">
        <label for="inputPassword4" class="form-label">Password</label>
        <input name="pass" type="password" class="form-control" id="inputPassword4" onChange={inputsHandler} value={inputField.last_name} placeholder='Enter your Password'/>
      </div>
      <br/>
      <button type="submit" class="btn btn-success" onClick={submitButton}>Login</button>
    </div>
  )
}

ReactDOM.render(
  <MySingUpWithHook />,
  document.getElementById('root')
);
