import { NavLink } from "react-router-dom";

const Login : React.FC<{}> = (): JSX.Element => {

    return (
     <div>
        Login Component
        <NavLink to={"/home"}> Login ! </NavLink>
     </div>
     
    );
  };

  export default Login