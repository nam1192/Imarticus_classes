import React from 'react';

export default function Header(props) {
  return (
    <header className="block row center">
      <div>
        <a href="#/">
        <h1>Mobile Shopping Centre</h1>
        </a>
      </div>
      <div>
        <a href="#/cart">
          {' '}
          {props.countCartItems ? (
            <button id="cartbtn" className="badge"><i class="fas fa-shopping-cart"></i>{props.countCartItems}</button>
          ) : (
            ''
          )}
        </a>{' '}
        {/* <a href="#/signin"> SignIn</a> */}
      </div>
    </header>
  );
}
