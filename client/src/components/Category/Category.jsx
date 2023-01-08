import './Category.css';

export function Category({ category }) {
  return (
    <div className="category">
      <img className="category__image" src={category.image} />
      <h4 className="category__name">{category.name}</h4>
      <p className="category__description">{category.description}</p>
    </div>
  );
}
