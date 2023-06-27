import { NavLink } from "react-router-dom";
import { Formik, Field, Form, ErrorMessage } from "formik";

const Login : React.FC<{}> = (): JSX.Element => {

   interface requestOptions {
      method: string,
      headers: Headers,
      redirect: RequestRedirect
      body: BodyInit,

   }
   
   const signUp = () => {
      var myHeaders = new Headers();
      myHeaders.append("Content-Type", "application/json");
      myHeaders.append("Cookie", "Tester=s%3AyD55O6I-VA2mDiByiC8Ktbf7-cJpLcwG.9FF2gmkaowp6G3dZOgAXXGabvsiGJqVpCnPpeYX3R3c");
      
      var raw = JSON.stringify({
        "userName": "Adam",
        "email": "alehrer@box.com",
        "password": "password",
        "roles": [
          "ROLE_USER"
        ]
      });
      
      var requestOptions : requestOptions= {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
      };
      
      fetch("http://localhost:8080/api/auth/signup", requestOptions)
        .then(response => response.text())
        .then(result => console.log(result))
        .catch(error => console.log('error', error));
   }

   const initialValues = {
      username: "",
      password: "",
    };
    return (
     <div>
        SignUp Component
        <NavLink to={"/home"}> Login ! </NavLink>
        <div className="col-md-12">
        <div className="card card-container">
          <img
            src="//ssl.gstatic.com/accounts/ui/avatar_2x.png"
            alt="profile-img"
            className="profile-img-card"
          />

          <Formik
               onSubmit={() => signUp()} 
               initialValues={initialValues}          
                   >
            <Form>
              <div className="form-group">
                <label htmlFor="username">Username</label>
                <Field name="username" type="text" className="form-control" />
                <ErrorMessage
                  name="username"
                  component="div"
                  className="alert alert-danger"
                />
              </div>

              <div className="form-group">
                <label htmlFor="password">Password</label>
                <Field name="password" type="password" className="form-control" />
                <ErrorMessage
                  name="password"
                  component="div"
                  className="alert alert-danger"
                />
              </div>

              {/*  <div className="form-group">
               <button type="submit" className="btn btn-primary btn-block" disabled={loading}>
                  {loading && (
                    <span className="spinner-border spinner-border-sm"></span>
                  )}
                  <span>Login</span>
                </button>
              </div>

              {message && (
                <div className="form-group">
                  <div className="alert alert-danger" role="alert">
                    {message}
                  </div>
                </div>
              )} */}
            </Form>
          </Formik>
        </div>
      </div>
     </div>
     
    );
  };

  export default Login