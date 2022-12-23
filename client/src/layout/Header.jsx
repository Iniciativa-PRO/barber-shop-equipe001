import { Link } from 'react-router-dom';

export function Header() {
  return (
    <>
      <header>
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/agendar">Agendar serviço</Link>
            </li>
            <li>
              <Link to="/login">Entrar</Link>
            </li>
          </ul>
        </nav>
      </header>
    </>
  );
}
