import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import CategoryPage from './CategoryPage'


function CategoryPages({ match }) {
    return (
      <div>
        <h2>CategoryPage</h2>
        <ul>
          <li>
            <Link to={`${match.url}/components`}>Components</Link>
          </li>
        </ul>
  
        <Route path={`${match.path}/:topicId`} component={CategoryPage} />
        <Route exact path={match.path}
        />
      </div>
    );
  }

  
export default CategoryPage;