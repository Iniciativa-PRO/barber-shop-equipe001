import aboutImage from '../assets/img/about-image.png';
import '../assets/style/About.css';

export function About() {
  return (
    <div className="row about">
      <div className="about__content">
        <h2 className="about__title">Sobre nós</h2>
        <h3 className="about__welcome">Bem-vindo a Pro Babershop</h3>
        <p className="about__text">
          Seja bem vindo a Barbearia Iniciativa PRO, Somos a melhor barbearia da
          cidade, sinta-se a vontade em nossas comodações cortes, barbas
          estilizadas, tingimento de cabelo, manicure e podologia, hidradatação,
          esfoliação e etc.
        </p>
      </div>
      <img className="about__image" src={aboutImage} />
    </div>
  );
}
