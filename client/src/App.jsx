import { Routes, Route } from 'react-router-dom';

import './assets/lib/reset.css';
import './assets/lib/normalize.css';
import './assets/style/global.css';
import './App.css';

import { Home } from './pages/Home';
import { MainLayout } from './layout/MainLayout';
import { Login } from './pages/Login';
import { ScheduleAppointment } from './pages/ScheduleAppointment';

function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<MainLayout />}>
          <Route index element={<Home />} />
          <Route path="login" element={<Login />} />
          <Route path="agendar" element={<ScheduleAppointment />} />
          <Route path="*" element={<h1> 404 Not found </h1>} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
