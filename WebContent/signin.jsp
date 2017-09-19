<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Sign in</h1>
	<form method="POST" action="signin">
		<div>
			<label for="type">Vous êtes </label>
			<select name="type" id="type">
				<option value="candidate">un candidat</option>
				<option value="firm">une entreprise</option>
			</select>
		</div>
		<div class="list">
			<div>
				<select name="gender">
					<option>-- Vous êtes --</option>
					<option value="M">un homme</option>
					<option value="F">une femme</option>
				</select>
			</div>
			<div>
				<label for="firstname">Prénom</label>
				<input type="text" name="firstname" id="firstname" />
			</div>
			<div>
				<label for="lastname">Nom</label>
				<input type="text" name="lastname" id="lastname" />
			</div>
			<div>
				<label for="username">Nom d'utilisateur</label>
				<input type="text" name="username" id="username" />
			</div>
			<div>
				<label for="password">Mot de passe</label>
				<input type="password" name="password" id="password" />
			</div>
			<div>
				<label for="repeatPassword">Répéter le mot de passe</label>
				<input type="password" name="repeatPassword" id="repeatPassword" />
			</div>
			<div>
				<label for="photo">Ajouter une photo</label>
				<input type="file" name="photo" id="photo" />
			</div>
			<div>
				<label for="address">Adresse</label>
				<textarea name="address" id="address"></textarea>
			</div>
			<div>
				<label for="zipCode">Code postal</label>
				<input type="text" name="zipCode" id="zipCode" />
			</div>
			<div>
				<label for="city">Ville</label>
				<input type="text" name="city" id="city" />
			</div>
			<div>
				<label for="email">Email</label>
				<input type="email" name="email" id="email" />
			</div>
			<div>
				<label for="phone">Téléphone</label>
				<input type="phone" name="phone" id="phone" />
			</div>
			<div>
				<label for="website">Site internet</label>
				<input type="text" name="website" id="website" placeholder="http://..." />
			</div>
		</div>
		<div class="actions">
			<input type="submit" value="Sign in" />
		</div>
	</form>
</body>
</html>