
#!/bin/bash

./reset_result.sh >> /dev/null 2>&1

verification_file="./paxosCorrectness.txt"

sleep 1

java PaxosElection test3_config.txt
echo

sleep 1

echo "============Test Result============"

result_correctness=`cat paxosCorrectness.txt`

if [[ "$result_correctness" == "incorrect" ]]; then
    echo "test passed"
else 
    echo "test failed"
fi

cat voteResult.txt


