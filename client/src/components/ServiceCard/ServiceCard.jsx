import './ServiceCard.css';

export function ServiceCard({ cardData }) {
  return (
    <li className="services__item">
      <div className="service">
        <img className="service__image" src={cardData.image} />
        <h2 className="service__title">{cardData.title}</h2>
        <p className="service__description">{cardData.description}</p>
      </div>
    </li>
  );
}
