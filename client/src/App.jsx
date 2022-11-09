import "./App.css"

import { Routes, Route} from 'react-router-dom'

import Navbar from './components/Navbar';
import Footer from './components/Footer';

import Home from './pages/Home';
import Login from './pages/Login';
import Agendamento from './pages/Agendamento';

function App() {
  return (
    <div className='pagina'>
      <Navbar />

      <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/Agendamento" element={<Agendamento />} />
      </Routes>

      <Footer />


    </div>
  );
}

export default App;