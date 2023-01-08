import './Gallery.css';

import galleryData from '../../constants/gallery.json';
import { Category } from '../../components/Category/Category';

export function Gallery() {
  return (
    <section className="gallery">
      <div className="row gallery__container">
        <div className="section-header">
          <h2 className="section-header__title section-header__title--black">
            Resultados incríveis
          </h2>
          <h3 className="section-header__subtitle">Galeria de fotos</h3>
        </div>

        <div className="gallery__categories">
          {galleryData.map((category) => (
            <Category key={category.id} category={category} />
          ))}
        </div>
      </div>
    </section>
  );
}
