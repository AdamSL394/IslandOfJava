import Movie from '../components/listMovies'
import { NavLink } from "react-router-dom";

const Home : React.FC<{}> = (): JSX.Element => {
    return (
     <div>
         <NavLink to={"/"}> Back ! </NavLink>
        Home Component
        <Movie></Movie>
     </div>
     
    );
  };

  export default Home