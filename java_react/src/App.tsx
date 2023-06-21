import './App.css';
import Home from './pages/Home'
import Login from './pages/Login'
import { Routes, Route, BrowserRouter  } from "react-router-dom";

function App() {
  return (
    <div className="App">
       <BrowserRouter>
       <Routes>
           <Route path="/" element={<Login />} />
           <Route path="/home" element={<Home />} />
       </Routes>
     </BrowserRouter>
    </div>
  );
}

export default App;
