import './ServicesTableItem.css';

export function ServicesTableItem({ service }) {
  return (
    <tr className="services-table__row">
      <td className="services-table__service-name">{service.name}</td>
      <td className="services-table__service-price">R$ {service.price}</td>
    </tr>
  );
}
