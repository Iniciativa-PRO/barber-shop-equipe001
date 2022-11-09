import { Link } from 'react-router-dom'

import logo from '../img/iniciativa-pro-logo.png'
import "./Navbar.css"

function Navbar() {
    return (
        <nav className='navegacao'>
            <header>
                <Link to="/" className='logo'>
                    <img src={logo} alt='logo' />
                </Link>
                <ul className='lista'>
                    <li className='itens'>
                        <Link to="/">Home</Link>
                    </li>
                    <li className='itens'>
                        <Link to="/login">Login</Link>
                    </li>
                    <li className='itens'>
                        <Link to="/agendamento">Agendamento</Link>
                    </li>
                </ul>
            </header>
        </nav>
    );
}

export default Navbar;