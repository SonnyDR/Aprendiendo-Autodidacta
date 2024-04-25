import React from 'react'
import '../styles/card.css'

function Card(props) {
  return (
    <>
    <div className='card-box'>
        <h1>{props.title}</h1>
        <h3>{props.description}</h3>
        <img src="{props.imageURL}" alt="" />
    </div>
    </>
  )
}

export default Card