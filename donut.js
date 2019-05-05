    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Tipo', 'Num. of Employees'],
          ['Assigned',rawData[0].value],
          ['Not Assigned',rawData[1].value]
        ]);

        var options = {
        	title:'% of Employees Assigned to Projects',
          pieHole: 0.7,
            colors:['962B33','#EAE9E9'],
          pieSliceTextStyle: {
            color: 'black',
          },
          legend: 'Assigned'          
        };

        var chart = new google.visualization.PieChart(document.getElementById('donut_single'));
        chart.draw(data, options);
      }