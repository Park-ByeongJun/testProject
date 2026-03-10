$(function(){
	fetch("/bringD")
		.then(res => {
			if(!res.ok){
				throw new Error("error");
			}
			return res.json();
		})
		.then(data => {
			const rows = data.map(item => `
					<tr>
						<td>${item.userId}</td>
						<td>${item.name}</td>
						<td>${item.number}</td>
					</tr>
				`).join("");
				
				$("#informTable").html(rows);
		})
		.catch(err => {
			console.error(err);
		});
});