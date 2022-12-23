import { Link, Outlet } from 'react-router-dom';
import { Header } from './Header';

export function MainLayout() {
  return (
    <>
      <Header />
      <main>
        <Outlet />
      </main>
    </>
  );
}
