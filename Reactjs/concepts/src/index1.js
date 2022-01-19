import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

// function Addition(props){
//   let result = parseInt(props.a) + parseInt(props.b);
//   return <h1>Addition of {props.a} and {props.b} is {result}</h1>
// }


class Calc extends React.Component{
  constructor(props){
    super(props);
    this.a=parseInt(this.props.a);
    this.b=parseInt(this.props.b);
  }
  render(){
  return <div>
  <h2>Addition = {this.a+this.b}</h2> 
  <h2>Subtraction = {this.a-this.b}</h2> 
  <h2>Multiplication = {this.a*this.b}</h2> 
  <h2>Division = {this.a/this.b}</h2> 
  </div>
}
}

ReactDOM.render(
    <Calc a="30" b="10" />,
  document.getElementById('root')
);

// function Calc(props){
//   let x=parseInt(props.a);
//   let y=parseInt(props.b);
//   let z=parseInt(props.c);
//   let result = (x + y + z)/3;
//   if (result>90){
//   return <h1> marks scored {props.a}, {props.b} and  {props.c} - A grade </h1>
// } else if (result>80){
//   return <h1> marks scored {props.a}, {props.b} and  {props.c} - B grade </h1>
// } else if (result>70){
//   return <h1> marks scored {props.a}, {props.b} and  {props.c} - C grade </h1>
// } else{ 
//   return <h1> marks scored {props.a}, {props.b} and  {props.c} - Fail </h1> }
// }
// ReactDOM.render(<Calc a="85" b="90" c="73"/>  , document.getElementById('root'));

// function Grading(props){
//   let polity = parseInt(props.a);
//   let social = parseInt(props.b);
//   let environment = parseInt(props.c);
//    let result = (polity + social + environment)/3;
//   if (result>=90){
//   return <h1> Marks scored {props.a}, {props.b} and  {props.c} - A grade </h1>
// } else if (result>=80){
//   return <h1> Marks scored {props.a}, {props.b} and  {props.c} - B grade </h1>
// } else if (result>=70){
//   return <h1> Marks scored {props.a}, {props.b} and  {props.c} - c grade </h1>
// } else{ 
//   return <h1> Marks scored {props.a}, {props.b} and  {props.c} - Fail </h1> }
// }

// ReactDOM.render(
//   <Grading a="80" b="80" c="80"/>,
//   document.getElementById('root')
// );


// ReactDOM.render(
//     <Calculation a="10" b="20" />,
//   document.getElementById('root')
// );






reportWebVitals();
