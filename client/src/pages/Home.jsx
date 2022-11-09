import "./Home.css"

function Home() {
    return (
        <div className='home'>
    
          <div className='informacoes-home'>
            <div className='container-titulo'>
            <h1 className='titulo'>INICIATIVA PRO BARBERSHOP</h1>
            </div>
              <div className='container-bem-vindo'>
                <p className='texto-bem-vindo'>Seja bem vindo a Barbearia Iniciativa PRO, Somos a melhor barbearia da cidade, sinta-se a vontade em nossas acomodações cortes, barbas estilizadas, tingimento de cabelo,Manicure e Podologia, Hidradatação e esfoliação e etc.</p>
              </div>
    
              <div className='container-botao'>
                <button class="botao-agendar">AGENDE O SEU CORTE</button>
              </div>
            
          </div>
    
        </div>
      );
}

export default Home;