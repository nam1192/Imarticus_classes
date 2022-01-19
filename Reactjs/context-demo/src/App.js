import './App.css';
import React from 'react';

//creating context using contextAPI

const ThemeContext = React.createContext('white');


class App extends React.Component{
  render(){
    //return <Toolbar theme="black" />
    return (<ThemeContext.Provider value='black'>
      <Toolbar />
    </ThemeContext.Provider>
    );
  }
}

// val='this.state.value'

function Toolbar(props){
  return(
    <div>
      <ThemedButton />
    </div>
  );
}

// class ThemedButton extends React.Component{
//   static contextType = ThemeContext;
//   render(){
//     return <button style={{backgroundColor:this.context, color:"white",padding:"15px 30px"}}>ClickMe</button>
//   }
// }

class ThemedButton extends React.Component {
    constructor(props) {
      super(props);
      this.state = {
        value: "",
        c: "",
        result: ""
      };
      this.rupeeHandler = this.rupeeHandler.bind(this);
      this.yenHandler = this.yenHandler.bind(this);
      this.handleChange = this.handleChange.bind(this);
      this.handleSubmit = this.handleSubmit.bind(this);
  
    }
    handleChange(event) {
      this.setState({ value: event.target.value })
  
    }
    rupeeHandler(event) {
      this.setState(
        { c: " Indian Rupees" }
      );
      this.setState(
        { result: this.state.value * 74.52 }
      );
  
  
    }
    yenHandler(event) {
      this.setState(
        { c: " Japanese Yen" }
      );
      this.setState(
        { result: this.state.value * 115.81 }
      );
  
  
    }
    handleSubmit(event) {
      event.preventDefault();
  
    }
    static contextType = ThemeContext;
    render() {
      const val = this.state.value;
      
      return (<fieldset>
        <legend>Enter the amount you want to Convert:</legend>
        <p>Currency converter using context (Redux)</p>
        <form onSubmit={this.handleSubmit}>
          <label>
          <input type="text" value={val} onChange={this.handleChange} placeholder='Enter amount'/> <br></br> <br></br>
          {/* <input type="text" value={this.context} onChange={this.handleChange} placeholder='Enter amount'/> <br></br> <br></br> */}
          </label>
          <button style={{backgroundColor:this.context, color:"white",padding:"15px 30px"}} onClick={this.rupeeHandler}>Rupees</button>
          <button style={{backgroundColor:this.context, color:"white",padding:"15px 30px"}} onClick={this.yenHandler}>Yen</button>
          {/* <button onClick={this.rupeeHandler}>Rupees</button>
          <button onClick={this.yenHandler}>Yen</button> */}
          <h1>{this.state.value + " Dollar is " + this.state.result + this.state.c}</h1>
        </form>
      </fieldset>
      );
    }
  }
  
  

export default App;