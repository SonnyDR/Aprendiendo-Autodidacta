function Suma(props) {

    // ? - Significa si, como el if()
    // : - Siginifica else
    const validar = false
    // return <h1>{validar ? 'alejo' : 'arias'}</h1>
  
    const objet = {
      nombre: "pepito"
    }
  
    //las <> vacias se llaman frakments, que nos ayuda a encerrar nuestro codigo dentro de una etiqueta como lo solicita react, pero siendo una etiqueta vacia.
    return <>
  
      <h1>
        {props.title}
      </h1>
  
    </>
  
  } 

  //El export default exporta todo yy el export delante de la funcion, exporta de manera individual a cada funcion
  export default Suma;