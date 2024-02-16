const addBtn = document.getElementById("add-btn");

if (addBtn) {
    addBtn.addEventListener("click", () => {
        fetch("/api/task", {
            method: "POST",
            headers: {
                "Content-type": "application/json",
            },
            body: JSON.stringify({
                contents: document.getElementById("input-box").value,
            }),
        }).then(response => {
            if (response.ok) {
                location.reload();
            }
        });
    });
}

const deleteBtns = document.getElementsByClassName("delete-btn");

if (deleteBtns) {
    for (let i = 0; i < deleteBtns.length; i++) {
        let id = deleteBtns[i].getAttribute("id").substring(5);

        deleteBtns[i].addEventListener("click", () => {
            fetch("/api/task/" + id, {
                method: "DELETE",
                headers: {
                    "Content-type": "application/json",
                },
            }).then(response => {
                if (response.ok) {
                    location.reload();
                }
            });

        });
    }
}

const list = document.getElementsByTagName("li");

if (list) {
    for (let i = 0; i < list.length; i++) {
        let li = list[i];

        li.addEventListener("click", () => {
            if(li.getAttribute("class") === "checked") {
                li.setAttribute("class", "");
            } else {
                li.setAttribute("class", "checked");
            }
        });
    }
}