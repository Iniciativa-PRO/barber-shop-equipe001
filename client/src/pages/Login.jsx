import LogoIniciativaPro from '../img/iniciativa-pro-logo.png';

import '../App.css';

import React, { useState } from 'react';

export function Login() {
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');

  return (
    <div className="conntainer">
      <div className="container-login">
        <div className="quadro-login">
          <form className="login-form">
            <span className="login-form-title">BarberShop App</span>
            <span className="login-form-title">
              <img src={LogoIniciativaPro} alt="Logo da Marca Iniciativa Pro" />
            </span>
            <div className="quadro-input">
              <input
                className={email !== '' ? 'has-val input' : 'input'}
                type="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
              <span className="focus-input" data-placeholder="Email"></span>
            </div>

            <div className="quadro-input">
              <input
                className={senha !== '' ? 'has-val input' : 'input'}
                type="password"
                value={senha}
                onChange={(e) => setSenha(e.target.value)}
              />
              <span className="focus-input" data-placeholder="Senha"></span>
            </div>

            <div className="container-login-form-pro">
              <button className="login-form-pro">Login</button>
            </div>

            <div className="texto-nao-tem-conta">
              <span className="nao-tem-conta">Não possui conta?</span>
              <a className="texto-criar-conta" href="x#">
                Criar conta.
              </a>
            </div>
          </form>
        </div>
      </div>
    </div>
  );
}
