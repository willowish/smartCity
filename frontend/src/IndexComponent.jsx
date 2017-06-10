import React from 'react';
import './styles.scss'
export default class IndexComponent extends React.Component {
	constructor() {
		super();
	}

	render() {
		return (
			<div class="supreme-container">
				<div class="main-container">
					<div class="logo-container"><div class="logo"></div></div>
					<div class="background-image-container"></div>
					<div class="inputs-container">
						<div class="row">
							<form class="col s12">
								<div class="row">
									<div class="input-field col s12">
										<input id="text" type="text"/>
										<label for="password">From</label>
									</div>
								</div>
								<div class="row">
									<div class="input-field col s12">
										<input id="destination" type="text"/>
										<label for="destination">Destination</label>
									</div>
								</div>
							</form>
						</div>
					</div>
					<button class="btn waves-effect waves-light search-button "
							type="submit"
							name="action">Search
					</button>
				</div>
			</div>
		);
	}
}
