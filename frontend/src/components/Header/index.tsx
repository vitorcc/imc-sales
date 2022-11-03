import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="IMCSales" />
                <h1>IMC Sales</h1>
                <p>
                    Desenvolvido por 
                    <a href="https://instagram.com/imcsolucoestecnologicas"> imctechnologicalsolutions</a>
                </p>
            </div>
        </header>
    )

}

export default Header
