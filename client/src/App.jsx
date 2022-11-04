import LogoIniciativaPro from './img/Iniciativa-pro-logo.png'

import "./App.css"

import React, { useState } from 'react';

function App(){
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");

  return(
   <div className="conntainer">
    <div className="container-login">
      <div class="quadro-login">
        <form class="login-form">

          <span class="login-form-title">BarberShop App</span>
          <span class="login-form-title">
            <img src={LogoIniciativaPro} alt="Logo da Marca Iniciativa Pro" />
          </span>
          <div class="quadro-input">
            <input 
              className={email !== "" ? 'has-val input' : 'input'} 
              type="email" 
              value={email} 
              onChange = {e => setEmail(e.target.value)} 
              />
            <span class="focus-input" data-placeholder="Email" ></span>
          </div>

          <div class="quadro-input">
            <input 
              className={senha !== "" ? 'has-val input' : 'input'}
              type="password" 
              value={senha}
              onChange = {e => setSenha(e.target.value)}
              />
            <span class="focus-input" data-placeholder="Senha" ></span>
          </div>

          <div class="container-login-form-pro">
            <button class="login-form-pro">Login</button>
          </div>

          <div class="texto-nao-tem-conta">
            <span className="nao-tem-conta">Não possui conta?</span>
            <a className="texto-criar-conta" href="x#" >Criar conta.</a>
          </div>

        </form>
      </div>
    </div>
   </div>

  );
}

export default App;