import './SectionHeader.css';

export function SectionHeader({ title, subTitle }) {
  return (
    <div className="section-header">
      <h2 className="section-header__title">{title}</h2>
      <h3 className="section-header__subtitle">{subTitle}</h3>
    </div>
  );
}
