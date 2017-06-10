import React from "react";
import ReactDOM from "react-dom";

import {BrowserRouter} from "react-router";

import Index from './IndexComponent.jsx';
import Layout from './Layout/Layout';

const app = document.getElementById('app');

ReactDOM.render(
	<BrowserRouter>
		<App />
	</BrowserRouter>, app);
