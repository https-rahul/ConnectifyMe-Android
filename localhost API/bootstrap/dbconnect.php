<?php

	$dbh = 'mysql:host=localhost; dbname=connectifyme';
	$username = 'root';
	$password = '';

	try {
		$pdo = new PDO($dbh,$username,$password);
	} catch (Exception $e) {
		echo "Connection Error";
		die();
	}
?>