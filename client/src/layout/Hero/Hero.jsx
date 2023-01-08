import { Link } from 'react-router-dom';

import './Hero.css';

export function Hero() {
  return (
    <section className="hero">
      <div className="hero__content row">
        <h1 className="hero__title">Pro Babershop</h1>
        <p className="hero__apresentation">
          Somos a melhor barbearia da cidade, sinta-se a vontade em nossas
          comodações cortes, barbas estilizadas, tingimento de cabelo, manicure
          e podologia, hidradatação e esfoliação, etc.
        </p>
        <Link to="/agendar">
          <button className="hero__button hero__button--primary">
            Quero agendar!
          </button>
        </Link>
      </div>
    </section>
  );
}
