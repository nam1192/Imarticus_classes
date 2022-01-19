import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


// --------------------------------------------------
// TOGGLE IMAGE : 

// class MySwitch extends React.Component{
//   constructor(props){
//     super(props);  
//     this.state = {isOn : true};    
//     this.myHandler = this.myHandler.bind(this);
//   }

//   myHandler(){
//     this.setState( i => (
//       {isOn: !i.isOn}
//     ));
//   }

//   render(){
//     return (
//       <div>
//       <h1>Click on the image to toggle</h1>
//       <button onClick={this.myHandler}>{this.state.isOn ? <img src="dog.jpg" width="300px" height="300px"/>:<img src="dog2.jpg" width="300px" height="300px"/>}</button>
//       </div>
//     );
//   }
// }

// ReactDOM.render(  
//   <MySwitch /> ,
// document.getElementById('root')
// );



// ----------------------------------------------------
// CALCULATOR: 

// class Calculator extends React.Component
// {
//   constructor()
//   {
//     super();
//     this.handlerCal = this.handlerCal.bind(this);
    
//     this.state={
//       x:"",
//       y:"",
//       calcu:"",
//       answer:"",
//     }
//   }
//   handlerCal(calcu)
//   {
//     var answer;
//     var x= document.getElementById("x").value;
//     var y=document.getElementById("y").value;
//     x=parseInt(x);
//     y=parseInt(y);
//     switch(calcu)
//     {
//       case "+":answer=x+y;
//               break;
//       case "-":answer=x-y;
//               break;
//       case "*":answer=x*y;
//                 break;
//       case "/":answer=x/y;
//                 break;
//     }
//    this.setState(({
//       x:x,
//       y:y,
//       answer:answer,
//       calcu:calcu
//    }));
//   }  

//   render()
//   {
//     return(
//     <>
//     <h1>Simple Calculator</h1>
//    <table>
//      {/* <tr>
//    <h2>{this.state.x} {this.state.calcu} {this.state.y} = {this.state.answer} </h2>
//    </tr> */}
//    <tr> <input  id="x" type="text" defaultValue={this.state.x}/></tr>
//    <tr> <input  id="y" type="text" defaultValue={this.state.y}/></tr>
//    <tr>
//    <h2>{this.state.x} {this.state.calcu} {this.state.y} = {this.state.answer} </h2>
//    </tr>
//    </table>
//    <button id="inr" onClick={()=>this.handlerCal("+")} >+</button>
//    <button id="inr" onClick={()=>this.handlerCal("-")} >-</button>
//    <button id="inr" onClick={()=>this.handlerCal("*")} >*</button>
//    <button id="inr" onClick={()=>this.handlerCal("/")} >/</button>
   
// </>
//     )
//   }
// }

// ReactDOM.render(  
//  < Calculator/>,
  
// document.getElementById('root')
// );

// -----------------------------------------
//Currency Converter:

// class CurrencyConverter extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = {
//       value: "",
//       c: "",
//       result: ""
//     };
//     this.rupeeHandler = this.rupeeHandler.bind(this);
//     this.yenHandler = this.yenHandler.bind(this);
//     this.handleChange = this.handleChange.bind(this);
//     this.handleSubmit = this.handleSubmit.bind(this);

//   }
//   handleChange(event) {
//     this.setState({ value: event.target.value })

//   }
//   rupeeHandler(event) {
//     this.setState(
//       { c: " Indian Rupees" }
//     );
//     this.setState(
//       { result: this.state.value * 74.52 }
//     );


//   }
//   yenHandler(event) {
//     this.setState(
//       { c: " Japanese Yen" }
//     );
//     this.setState(
//       { result: this.state.value * 115.81 }
//     );


//   }
//   handleSubmit(event) {
//     // alert(this.state.value+" Dollar is "+ this.state.result+ this.state.c);
//     event.preventDefault();

//   }

//   render() {
//     const val = this.state.value;
//     return (<fieldset>
//       <legend>Enter the amount :</legend>
//       <form onSubmit={this.handleSubmit}>
//         <lable>
//           <input type="text" value={val} onChange={this.handleChange} /> <br></br> <br></br>
//         </lable>
//         <button onClick={this.rupeeHandler}>Rupees</button>
//         <button onClick={this.yenHandler}>Yen</button>
//         <h1>{this.state.value + " Dollar is " + this.state.result + this.state.c}</h1>
//       </form>
//     </fieldset>
//     );
//   }
// }


// ReactDOM.render(
//   <CurrencyConverter />,
//   document.getElementById("root")
// );




// ---------------------------------------------------
// Grading 

class Grade extends React.Component
{
  constructor()
  {
    super();
    this.handler = this.handler.bind(this);
    this.state={
      a:"",
      b:"",
      c:"",
      grade:"",
    }
  }
  handler()
  {
    var grade;
    var a= document.getElementById("a").value;
    var b=document.getElementById("b").value;
    var c=document.getElementById("c").value;
    a=parseInt(a);
    b=parseInt(b);
    c=parseInt(c);
    var result=((a+b+c)/3);
   if(result>=90 && result<=100)
   {
     grade="A";
   }else if(result>=80 && result<90)
   {
     grade = "B";
   }else if(result>=60 && result<80)
   {
     grade="C"
   }else{
     grade="Fail"
   }
   this.setState(({
      a:a,
      b:b,
      c:c,
      grade:grade,
   }));
   console.log(grade);
   console.log(result);
  }  

  render()
  {
    return(
    <>
    <h1>Calulate Your 3 subject grades</h1>
   <table>
   <tr> <input  id="a" type="text" placeholder='Subject 1' defaultValue={this.state.a}/></tr>
   <tr> <input  id="b" type="text" placeholder='Subject 2' defaultValue={this.state.b}/></tr>
   <tr> <input  id="c" type="text" placeholder='Subject 3' defaultValue={this.state.c}/></tr>
   <tr>
   <h1>Grade= {this.state.grade} </h1>
   </tr>
   </table>
   <button id="calculate" onClick={this.handler}>Find Grade</button>
    </>
    );
  }
}

ReactDOM.render(
  <Grade />,
  document.getElementById("root")
);




// ----------------------------------------
// Color the boxes:

// class Colour extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = { value: '' };
//     this.handleChange = this.handleChange.bind(this);
//   }
//   handleChange(event) {
//     this.setState({ value: event.target.value });

//   }
// }

// function MyBorder(props) {
//   return (
//     <div className={'MyBorder MyBorder-' + props.color}>
//       {props.children}
//     </div>
//   );
// }
// function MyBorder1(props) {
//   return (
//     <div className={'MyBorder1 MyBorder1-' + props.color}>
//       {props.children}
//     </div>
//   );
// }

// function MyDialogBox() {
//   return (
//     <div>
//       {/* onMouseOver={this.handleChange? MyBorder : MyBorder1} */}
//       <MyBorder color="green">
//         <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
//         <p className='MyDialog-message'>This is content from First Dialog Box.</p>
//       </MyBorder>
//       <MyBorder color="red">
//         <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
//         <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
//         <p className='MyDialog-message'>This is content from First Dialog Box.</p>
//       </MyBorder>
//       <MyBorder color="blue">
//         <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
//         <p className='MyDialog-message'>This is content from First Dialog Box.</p>
//       </MyBorder>
//     </div>
//   );
// }


// ReactDOM.render(
//   <MyDialogBox />,
//   document.getElementById('root')
// );