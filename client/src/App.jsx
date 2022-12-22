import { Routes, Route, Outlet, Link } from 'react-router-dom';

import './App.css';

import React, { useState } from 'react';
import { Home } from './views/Home';
import { MainLayout } from './layout/MainLayout';
import { Login } from './views/Login';
import { Agendar } from './views/Agendar';

function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<MainLayout />}>
          <Route index element={<Home />} />
          <Route path="login" element={<Login />} />
          <Route path="agendar" element={<Agendar />} />
          <Route path="*" element={<h1> 404 Not found </h1>} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
