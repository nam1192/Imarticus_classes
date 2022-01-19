import React from 'react';
import Product from './Product';

export default function Main(props) {
  const { products, onAdd } = props;
  return (
    <main className="block col-2 myblock">
      <h2>Deals Of The Day:</h2>
      <td>
      <div className="row1">
        {products.map((product) => (
          <Product key={product.id} product={product} onAdd={onAdd}></Product>
        ))}
      </div>
      </td>
    </main>
  );
}
