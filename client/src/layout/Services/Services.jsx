import { SectionHeader } from '../../components/SectionHeader/SectionHeader';
import { ServiceCard } from '../../components/ServiceCard/ServiceCard';
import { ServicesTable } from '../../components/ServicesTable/ServicesTable';
import {
  scissor,
  razor,
  hair,
  hairClipper,
} from '../../components/ServicesImages';

import './Services.css';

import servicesDescriptionsData from '../../constants/services-descriptions.json';
import hairServicesData from '../../constants/hair-services-menu.json';
import beardServicesData from '../../constants/beard-services-menu.json';

export function Services() {
  return (
    <section className="services">
      <div className="row">
        <SectionHeader
          title={'Nossos Serviços'}
          subTitle={'Conheça as especialidades da casa'}
        />
        <div className="services__content">
          <ul className="services__list">
            {servicesDescriptionsData.map((service) => (
              <ServiceCard key={service.id} cardData={service} />
            ))}
          </ul>
          <div className="services-tables">
            <div className="services-tables__content">
              <h2 className="services-tables__title">Lista de cortes</h2>
              <div className="services-tables__container">
                <ServicesTable
                  title={'Cortes basicos'}
                  data={hairServicesData}
                />
                <ServicesTable
                  title={'Ajustes de barba'}
                  data={beardServicesData}
                />
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
}
