import { ServicesTableItem } from '../ServicesTableItem/ServicesTableItem';

import './ServicesTable.css';

export function ServicesTable({ title, data }) {
  return (
    <table className="services-table">
      <caption className="services-table__caption">{title}</caption>
      <tbody>
        {data.map((service) => (
          <ServicesTableItem key={service.id} service={service} />
        ))}
      </tbody>
    </table>
  );
}
