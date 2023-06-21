import { useState } from "react"

interface requestOptions {
    method: string,
    headers: Headers,
    redirect: RequestRedirect
}

interface Film {
    name:string,
    age:{
        "timestamp": number,
        "date": string
    }
}

const Movies: React.FC<{}> = (): JSX.Element => { 
    const [movie, setMovies] = useState<Film[]>([])
    
    async function callJava() {
        var myHeaders = new Headers();

        const requestOptions: requestOptions = {
            method: 'GET',
            headers: myHeaders,
            redirect: 'follow'
        };

        await fetch("http://localhost:8080/api/v1/movies/all", requestOptions)
            .then(response => response.text())
            .then(result => {
                let films: Film[] = JSON.parse(result)
                setMovies(films);
                
            })
            .catch(error => console.log('error', error));
    }
    return (
        <div>
            <button onClick={() => callJava()}> Get Movies!</button>
            {movie? <>{movie.map((movie) => { 
                return <li>{movie.name}</li>})}</>:<></>}
        </div>
    );
};

export default Movies

