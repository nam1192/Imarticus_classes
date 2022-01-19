import React from 'react';

export default function Basket(props) {
  const { cartItems, onAdd, onRemove } = props;
  const itemsPrice = cartItems.reduce((a, c) => a + c.qty * c.price, 0);

    const totalPrice = itemsPrice;
  return (
    <aside className="block col-1">
      <h2>Cart Items</h2>
      <div>
        {cartItems.length === 0 && <div>Cart is empty</div>}
        {cartItems.map((item) => (
          <div key={item.id} className="row">
            <div className="col-2">{item.name}</div>
            <div className="col-2"><img className="small" src={item.image} alt={item.name} /></div>
            <div className="col-2">
              <button onClick={() => onRemove(item)} className="remove">
                -
              </button>{' '}
              <button onClick={() => onAdd(item)} className="add">
                +
              </button>
            </div>

            <div className="col-2 text-right">
              {item.qty} x {item.price.toFixed(2)}
            </div>
          </div>
        ))}

        {cartItems.length !== 0 && (
          <>
            <hr></hr>

            <div className="row">
              <div className="col-2">
                <strong>Final Price</strong>
              </div>
              <div className="col-1 text-right">
                <strong><i class="fas fa-rupee-sign"></i> {totalPrice.toFixed(2)}</strong>
              </div>
            </div>
            <hr />
            <div className="row">
              <button className='confirmbtn' onClick={() => alert('Oder Confirmed! Thanks For Shopping with us :)')
              }>
                Confirm
              </button>
            </div>
          </>
        )}
      </div>
    </aside>
  );
}
