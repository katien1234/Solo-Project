import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';
import { Route, Link, BrowserRouter as Router } from 'react-router-dom';
import App from './App';
import Quiz from './Quiz';


const routing = (
  <Router>
  <div>
        <ul>
          <section>
        <li>
            <Link to="/">Homepage</Link>
        </li>
         <li> <Link to="/Quiz">Quiz</Link>
        </li>
        <li>
          <Link to="/CategoryPage">Science</Link>
          </li>
        </section>
        </ul>
      <Route exact path="/" component={App} />
      <Route path="/Quiz" component={Quiz} />
    </div>
  </Router>
  );




ReactDOM.render(routing, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();