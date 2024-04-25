import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import  PrimerComponent  from  './components/PrimerComponent'
import { Button } from './components/Button';
import Card from './components/Card';

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  // <React.StrictMode>
  //   <App />
  // </React.StrictMode>
  <div>
    {/* <PrimerComponent title="hola jsx"/>

    <Button text="Boton 1"/>
    <Button text="Boton 2"/>
    <Button text="Boton 3"/> */}
    <Card 
      title="Snorlax"
      description="Es un pokemon dormilon :)"
      imageURL="./img/snorlax.webp"
      />
  </div>


);
